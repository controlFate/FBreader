//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.
//


package com.jayqqaa12.reader.ui.view.dialog;

import java.io.Serializable;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.TextView;
import com.jayqqaa12.reader.R.id;
import com.jayqqaa12.reader.R.layout;
import com.jayqqaa12.reader.model.BookFile;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class DeleteBookDialog_
    extends DeleteBookDialog
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String FILE_EXTRA = "file";
    public final static String MSG_EXTRA = "MSG";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_dialog_delete_book);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectExtras_();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static DeleteBookDialog_.IntentBuilder_ intent(Context context) {
        return new DeleteBookDialog_.IntentBuilder_(context);
    }

    public static DeleteBookDialog_.IntentBuilder_ intent(Fragment supportFragment) {
        return new DeleteBookDialog_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        tv = ((TextView) hasViews.findViewById(id.tv));
        cb = ((CheckBox) hasViews.findViewById(id.cb));
        {
            View view = hasViews.findViewById(id.tv_delete);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DeleteBookDialog_.this.onClick(view);
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.tv_cancel);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        DeleteBookDialog_.this.onClick(view);
                    }

                }
                );
            }
        }
        init();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(FILE_EXTRA)) {
                file = ((BookFile) extras_.getSerializable(FILE_EXTRA));
            }
            if (extras_.containsKey(MSG_EXTRA)) {
                MSG = extras_.getInt(MSG_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, DeleteBookDialog_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, DeleteBookDialog_.class);
        }

        public Intent get() {
            return intent_;
        }

        public DeleteBookDialog_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (context_ instanceof Activity) {
                    ((Activity) context_).startActivityForResult(intent_, requestCode);
                } else {
                    context_.startActivity(intent_);
                }
            }
        }

        public DeleteBookDialog_.IntentBuilder_ file(BookFile file) {
            intent_.putExtra(FILE_EXTRA, ((Serializable) file));
            return this;
        }

        public DeleteBookDialog_.IntentBuilder_ MSG(int MSG) {
            intent_.putExtra(MSG_EXTRA, MSG);
            return this;
        }

    }

}
