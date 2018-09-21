<template>
  <div class="movies">
    <h1>backend 에서 데이터 가져오기 업데이트</h1>
    <div v-for="movie in movies" class="movie">
      <img v-bind:src="movie.poster" class="poster">
      <div>
        <strong></strong>, <i></i> [{{movie.name}}]
        <router-link :to="{ name: 'show', params: { id: movie.id }}">더보기</router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  created () {
    this.$http.get('/api/movies')
    .then((response) => {

        this.movies = response.data
        console.log(this.movies);
     })
  },
  data () {
    return {
      movies: []
    }
  }
}
</script>
