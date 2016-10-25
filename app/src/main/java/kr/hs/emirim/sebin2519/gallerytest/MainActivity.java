package kr.hs.emirim.sebin2519.gallerytest;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery gallery;
    ImageView imgMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gallery=(Gallery)findViewById(R.id.gallery_1);
        imgMain=(ImageView)findViewById(R.id.img_main);
        MyGalleryAdapter ada=new MyGalleryAdapter(this);
        gallery.setAdapter(ada);
    }

    //내부클래스
    public class MyGalleryAdapter extends BaseAdapter{
        Context context;
        int[] imgIDs={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,
                       R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,
                       R.drawable.img11,R.drawable.img12,R.drawable.img13,R.drawable.img14,R.drawable.img15
        };//섬네일 이미지 -이미지파일의 값을 저장하는 배열

        MyGalleryAdapter(Context context) { //생성자
            this.context=context;
        }

        @Override
        public int getCount() { //이미지뷰 항목의 개수
            return imgIDs.length;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imgV=new ImageView(context);
            imgV.setLayoutParams(new Gallery.LayoutParams(100,150));//px단위
            imgV.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imgV.setPadding(5,5,3,5);
            imgV.setImageResource(imgIDs[position]);
            return imgV;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }
    }
}
