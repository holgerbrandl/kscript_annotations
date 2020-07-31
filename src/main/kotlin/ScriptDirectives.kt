@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class DependsOn(vararg val artifactLocators: String)

// add repo to annotation
//annotation class DependsOn(vararg val args : String, val from = "jcenter")

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class EntryPoint(val value: String)


@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class Include(val includePath: String)


@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class KotlinOpts(val runOptions: String)


@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class CompilerOpts(val kotlincFlags: String)

@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class ProguardConfig(val proguardConfig: String)


// MavenRepository and DependsOnMaven are supported "as it" for compatibility with jupyter notebooks.
// see https://github.com/kohesive/keplin/blob/master/keplin-maven-resolver/src/main/kotlin/uy/kohesive/keplin/kotlin/script/resolver/maven/MavenResolverAnnotations.kt
// example https://github.com/kohesive/keplin/blob/a307e05eae091c99c665fe3da52a428fb0e10a6a/keplin-maven-resolver/src/test/kotlin/uy/kohesive/keplin/kotlin/script/resolver/maven/TestMavenScriptDependencies.kt#L38


// note: in contrasts to DependsOn DependsOnMaven just supports a single artifact argument
@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@Repeatable
annotation class DependsOnMaven(val artifactLocator: String)

/**
 * Declare a maven repository that will be used by kscript to resolve dependencies
 *
 * @param id A user-defined name for this repository
 * @param url The endpoint under which maven will find the repo
 * @param user Optional user name
 * @param password Optional password (required if user is defined)
 */
@Target(AnnotationTarget.FILE)
@Retention(AnnotationRetention.SOURCE)
@Repeatable
annotation class MavenRepository(val id: String, val url: String, val user: String = "", val password: String = "")
