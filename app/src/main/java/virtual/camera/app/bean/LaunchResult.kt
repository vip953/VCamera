package virtual.camera.app.bean

/**
 *
 * @Description:
 * @Author: wukaicheng
 * @CreateDate: 2021/4/29 21:57
 */
data class LaunchResult(
    val success: Boolean,
    val message: String? = null,
    val errorCode: Int? = null
)
