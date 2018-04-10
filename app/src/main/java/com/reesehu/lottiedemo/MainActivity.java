package com.reesehu.lottiedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        // 逻辑代码的方式启动动画
//        final LottieAnimationView lottieAnimationView = findViewById(R.id.anim_view);
//        lottieAnimationView.setAnimation("hello-world.json");
//        lottieAnimationView.setRepeatCount(5);
//        lottieAnimationView.playAnimation();
//        // 添加动画的监听
//        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animator) {
//
//            }
//        });
//        // 监听动画进度
//        lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator valueAnimator) {
//
//            }
//        });
//        // 用于加载其他来源的JSON文件
//        final LottieDrawable lottieDrawable = new LottieDrawable();
////        LottieComposition.Factory.fromAssetFileName()
//        try {
//            JsonReader reader = new JsonReader(new InputStreamReader(
//                    new ByteArrayInputStream("json".getBytes("UTF-8")), "UTF-8"));
//            Cancellable cancellable = LottieComposition.Factory.fromJsonReader(reader, new OnCompositionLoadedListener() {
//                @Override
//                public void onCompositionLoaded(@Nullable LottieComposition composition) {
//                    lottieDrawable.setComposition(composition);
//                    lottieAnimationView.setImageDrawable(lottieDrawable);
//                    lottieAnimationView.playAnimation();
//                }
//            });
//            // 可取消
//            cancellable.cancel();
//
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
    }
}
