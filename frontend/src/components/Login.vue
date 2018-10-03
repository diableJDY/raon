<template>
  <div>
    <section class="hero is-primary">
      <div class="hero-body">
        <div class="container has-text-centered">
          <h2 class="title">Login or Register</h2>
          <p class="subtitle error-msg">{{ errorMsg }}</p>
        </div>
      </div>
    </section>
    <section class="section">
      <div class="container">
        <div class="field">
          <label class="label is-large" for="email">Email2222:</label>
          <div class="control">
            <input type="email" class="input is-large" id="email" v-model="email">
          </div>
        </div>
        <div class="field">
          <label class="label is-large" for="password">Password3333:</label>
          <div class="control">
            <input type="password" class="input is-large" id="password" v-model="password">
          </div>
        </div>

        <div class="control">
          <a class="button is-large is-primary" @click="authenticate">Login</a>
          <a class="button is-large is-success" @click="register">Register</a>
        </div>

      </div>
    </section>

  </div>
</template>
<script>
  export default {
    created() {
      // this.$http.get('/api/login')
      //   .then((response) => {
      //
      //     this.login = response.data
      //     console.log(this.login);
      //   })
    },
    data() {
      return {
        login: []
        , data: '안녕 로그인'
        , ck: false
      }
    }
  }
</script>
