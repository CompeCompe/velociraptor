<template>
<v-content>
  <v-card
    class="mx-auto"
    max-width="400"
    elevation="11"
  >
    <v-img
      class="white--text align-end"
      height="200px"
      src="https://img5.goodfon.ru/wallpaper/nbig/a/b5/art-minimalizm-dinozavr-velotsiraptor-velociraptor-synth-ret.jpg"
    >
    </v-img>

    <v-card-text class="text--primary">
      <div>Авторизуйтесь через доступный сервис</div>
    </v-card-text>

    <v-card-actions>
      <v-btn
        color="purple"
        class="white--text"
        text
        href="/login"
      >
        Google
      </v-btn>
    </v-card-actions>
  </v-card>
</v-content>
</template>
<script>
    export default {
        name: "Auth",
    }
</script>

<style scoped>

</style>