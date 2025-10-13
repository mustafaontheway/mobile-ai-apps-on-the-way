<script lang="ts">

  let counter = 0

  function inc() {
    counter++
  }

  function decr() {
    counter--
  }

</script>

<main>

  <button onclick={inc}>Counter ++</button>

  <p>Counter value: {counter}</p>

  <button onclick={decr}>Counter --</button>
  
</main>

