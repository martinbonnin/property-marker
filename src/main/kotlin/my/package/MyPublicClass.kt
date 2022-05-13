package my.`package`

class MyPublicClass {
    val publicField = "public"
    // hiddenField is not hidden
    @MyInternalApiAnnotation
    val hiddenField = "hidden"
}

fun publicFunction() {

}

// This works as expected
@MyInternalApiAnnotation
fun hiddenFunction() {

}