# Kotlin MutableList removeIf() Gotcha

This example demonstrates a common pitfall when using the `removeIf()` function with `MutableList` in Kotlin.  The `removeIf()` function modifies the list *in place* rather than returning a new list. This can lead to unexpected results if you're not aware of this behavior. The provided code shows a simple example of the issue and a solution to avoid it.