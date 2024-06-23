package com.donttouchphone.phone.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import android.widget.Toast;

import com.donttouchphone.phone.util.ConstantsKt;

import java.io.File;
import java.io.FileOutputStream;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001/B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0002J\u001a\u0010!\u001a\u00020\u00172\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015J\b\u0010#\u001a\u00020\u0017H\u0003J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001cH\u0016J\u0018\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(2\u0006\u0010 \u001a\u00020\u001cH\u0016J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001cH\u0016J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001cH\u0016J\b\u0010,\u001a\u00020\u0017H\u0002J\u0014\u0010-\u001a\u0004\u0018\u00010\u00132\b\u0010*\u001a\u0004\u0018\u00010\u0016H\u0002J\u0006\u0010.\u001a\u00020\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/donttouchphone/antitheftalarm/helper/CameraManager;", "Landroid/hardware/Camera$PictureCallback;", "Landroid/hardware/Camera$ErrorCallback;", "Landroid/hardware/Camera$PreviewCallback;", "Landroid/hardware/Camera$AutoFocusCallback;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bmp", "Landroid/graphics/Bitmap;", "getBmp", "()Landroid/graphics/Bitmap;", "setBmp", "(Landroid/graphics/Bitmap;)V", "dir", "Ljava/io/File;", "getDir", "()Ljava/io/File;", "encodedImage", "", "imageCallback", "Lkotlin/Function1;", "", "", "isFrontCameraAvailable", "", "()Z", "mCamera", "Landroid/hardware/Camera;", "mSurface", "Landroid/graphics/SurfaceTexture;", "autoFocusSupported", "camera", "getBase64Image", "callback", "initCamera", "onAutoFocus", "z", "onError", "i", "", "onPictureTaken", "bArr", "onPreviewFrame", "releaseCamera", "savePicture", "takePhoto", "Companion", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: CameraManager.kt */
public final class CameraManager implements Camera.PictureCallback, Camera.ErrorCallback, Camera.PreviewCallback, Camera.AutoFocusCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static CameraManager mManager;
    private Bitmap bmp;
    /* access modifiers changed from: private */
    public String encodedImage;
    /* access modifiers changed from: private */
    public Function1<? super byte[], Unit> imageCallback;
    /* access modifiers changed from: private */
    public Camera mCamera;
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */
    public SurfaceTexture mSurface;

    public CameraManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        this.mContext = context;
    }

    public final Bitmap getBmp() {
        return this.bmp;
    }

    public final void setBmp(Bitmap bitmap) {
        this.bmp = bitmap;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/donttouchphone/antitheftalarm/helper/CameraManager$Companion;", "", "()V", "mManager", "Lcom/donttouchphone/antitheftalarm/helper/CameraManager;", "getInstance", "context", "Landroid/content/Context;", "DontTouchMyPhone_v1.4.1(4)_May.31.2024_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: CameraManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CameraManager getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (CameraManager.mManager == null) {
                CameraManager.mManager = new CameraManager(context);
            }
            return CameraManager.mManager;
        }
    }

    public final void getBase64Image(Function1<? super byte[], Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "callback");
        this.imageCallback = function1;
    }

    public final void takePhoto() {
        if (isFrontCameraAvailable()) {
            initCamera();
        }
    }

    private final boolean isFrontCameraAvailable() {
        Context context = this.mContext;
        if (context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera")) {
            int numberOfCameras = Camera.getNumberOfCameras();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void initCamera() {
        Log.e("INTIAL", "camera");
//        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null,
//                        (CoroutineStart) null, new CameraManager$initCamera$1(this,
//                        null), 3, (Object) null);
//                .invokeOnCompletion(new CameraManager$initCamera$2(this));
    }

    public final boolean autoFocusSupported(Camera camera) {
        return camera != null && camera.getParameters().getSupportedFocusModes().contains("auto");
    }

    public final void releaseCamera() {
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.release();
            SurfaceTexture surfaceTexture = this.mSurface;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.mCamera = null;
            this.mSurface = null;
        }
    }

    public void onError(int i, Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        if (i == 1) {
            Log.e("ContentValues", "Camera error: Unknown");
        } else if (i == 2) {
            Log.e("ContentValues", "Camera error: Camera was disconnected due to use by higher priority user");
        } else if (i != 100) {
            Log.e("ContentValues", "Camera error: no such error id (" + i + ')');
        } else {
            Log.e("ContentValues", "Camera error: Media server died");
        }
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Intrinsics.checkNotNullParameter(bArr, "bArr");
        Intrinsics.checkNotNullParameter(camera, "camera");
        try {
            if (autoFocusSupported(camera)) {
                camera.setPreviewCallback((Camera.PreviewCallback) null);
                camera.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, this);
                return;
            }
            camera.setPreviewCallback((Camera.PreviewCallback) null);
            camera.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, this);
        } catch (Exception e) {
            Log.e("ContentValues", "Camera error while taking picture");
            e.printStackTrace();
            releaseCamera();
        }
    }

    public void onAutoFocus(boolean z, Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        try {
            camera.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, this);
            Camera camera2 = this.mCamera;
            Intrinsics.checkNotNull(camera2);
            camera2.autoFocus((Camera.AutoFocusCallback) null);
        } catch (Exception e) {
            e.printStackTrace();
            releaseCamera();
        }
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        Intrinsics.checkNotNullParameter(bArr, "bArr");
        Intrinsics.checkNotNullParameter(camera, "camera");
        Log.d("loginWatch", "image takenn");
//        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new CameraManager$onPictureTaken$1(this, bArr, null), 3, (Object) null);
    }

    public final String savePicture(byte[] bArr) {
        try {
            File dir = getDir();
            if (bArr == null) {
                Toast.makeText(this.mContext, "cant save image", Toast.LENGTH_SHORT).show();
                Log.e("saveImageLogg", "Can't save image - no data");
                return null;
            }
            if (!dir.exists()) {
                if (!dir.mkdirs()) {
                    Toast.makeText(this.mContext, "Can't create directory to save image", Toast.LENGTH_SHORT).show();
                    Log.e("saveImageLogg", "Can't create directory to save image.");
                    return null;
                }
            }
            String str = System.currentTimeMillis() + ".jpg";
            String str2 = dir.getPath() + File.separator + str;
            Log.d("saveImageLogg", str2);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            Log.d("saveImageLogg", "New image was saved" + str);
            return str2;
        } catch (Exception e) {
            Log.e("saveImageLogg", e.toString());
            e.printStackTrace();
            return null;
        }
    }

    private final File getDir() {
        return new File(this.mContext.getFilesDir(), ConstantsKt.INTRUDERS_IMAGES_LOCATION_ADDRESS);
    }
}
