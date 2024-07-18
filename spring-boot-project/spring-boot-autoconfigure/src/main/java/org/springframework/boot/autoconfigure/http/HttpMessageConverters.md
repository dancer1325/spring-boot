* := Bean
  * uses
    * manage `HttpMessageConverter` S -- _Example:_ add `HttpMessageConverter` S --
  * 👀 by default, -- registered with -- default `HttpMessageConverter`  👀
    * == Spring MVC `WebMvcConfigurationSupport`
    * 👀 if you want custom -> you -- can register via -- `HttpMessageConverters(HttpMessageConverter...)` 👀