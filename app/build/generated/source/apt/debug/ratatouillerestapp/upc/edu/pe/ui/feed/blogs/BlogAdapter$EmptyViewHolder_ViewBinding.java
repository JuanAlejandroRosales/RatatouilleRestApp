// Generated code from Butter Knife. Do not modify!
package ratatouillerestapp.upc.edu.pe.ui.feed.blogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import ratatouillerestapp.upc.edu.pe.R;

public class BlogAdapter$EmptyViewHolder_ViewBinding implements Unbinder {
  private BlogAdapter.EmptyViewHolder target;

  private View view2131558574;

  @UiThread
  public BlogAdapter$EmptyViewHolder_ViewBinding(final BlogAdapter.EmptyViewHolder target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_retry, "field 'retryButton' and method 'onRetryClick'");
    target.retryButton = Utils.castView(view, R.id.btn_retry, "field 'retryButton'", Button.class);
    view2131558574 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRetryClick();
      }
    });
    target.messageTextView = Utils.findRequiredViewAsType(source, R.id.tv_message, "field 'messageTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BlogAdapter.EmptyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.retryButton = null;
    target.messageTextView = null;

    view2131558574.setOnClickListener(null);
    view2131558574 = null;
  }
}
