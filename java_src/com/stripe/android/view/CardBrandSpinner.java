package com.stripe.android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.CardBrandSpinnerDropdownBinding;
import com.stripe.android.databinding.CardBrandSpinnerMainBinding;
import com.stripe.android.model.CardBrand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0014\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0017\u001a\u00020\u0007R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/view/CardBrandSpinner;", "Landroidx/appcompat/widget/AppCompatSpinner;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "cardBrandsAdapter", "Lcom/stripe/android/view/CardBrandSpinner$Adapter;", "defaultBackground", "Landroid/graphics/drawable/Drawable;", "onFinishInflate", "", "setCardBrands", "cardBrands", "", "setTintColor", "tintColor", "Adapter", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CardBrandSpinner extends AppCompatSpinner {
    private final Adapter cardBrandsAdapter;
    private Drawable defaultBackground;

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/view/CardBrandSpinner$Adapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/model/CardBrand;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "tintColor", "", "getTintColor$payments_core_release", "()I", "setTintColor$payments_core_release", "(I)V", "createCardBrandDrawable", "Landroid/graphics/drawable/Drawable;", "cardBrand", "getDropDownView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "getView", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Adapter extends ArrayAdapter<CardBrand> {
        private final LayoutInflater layoutInflater;
        private int tintColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Adapter(Context context) {
            super(context, 0);
            Intrinsics.checkNotNullParameter(context, "context");
            this.layoutInflater = LayoutInflater.from(context);
        }

        private final Drawable createCardBrandDrawable(CardBrand cardBrand) {
            Drawable m94299e = NA0.m94299e(getContext(), cardBrand.getIcon());
            if (m94299e != null) {
                Intrinsics.checkNotNullExpressionValue(m94299e, "requireNotNull(\n        …Brand.icon)\n            )");
                if (cardBrand == CardBrand.Unknown) {
                    Drawable m90834r = P61.m90834r(m94299e);
                    Intrinsics.checkNotNullExpressionValue(m90834r, "wrap(icon)");
                    P61.m90838n(m90834r.mutate(), this.tintColor);
                    Drawable m90835q = P61.m90835q(m90834r);
                    Intrinsics.checkNotNullExpressionValue(m90835q, "{\n                val co…compatIcon)\n            }");
                    return m90835q;
                }
                return m94299e;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup parent) {
            CardBrandSpinnerDropdownBinding inflate;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (view == null || (inflate = CardBrandSpinnerDropdownBinding.bind(view)) == null) {
                inflate = CardBrandSpinnerDropdownBinding.inflate(this.layoutInflater, parent, false);
            }
            Intrinsics.checkNotNullExpressionValue(inflate, "convertView?.let {\n     …tInflater, parent, false)");
            Object item = getItem(i);
            if (item != null) {
                Intrinsics.checkNotNullExpressionValue(item, "requireNotNull(getItem(position))");
                CardBrand cardBrand = (CardBrand) item;
                AppCompatTextView appCompatTextView = inflate.textView;
                appCompatTextView.setText(cardBrand.getDisplayName());
                appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(createCardBrandDrawable(cardBrand), (Drawable) null, (Drawable) null, (Drawable) null);
                AppCompatTextView root = inflate.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "viewBinding.root");
                return root;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final int getTintColor$payments_core_release() {
            return this.tintColor;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup parent) {
            CardBrandSpinnerMainBinding inflate;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (view == null || (inflate = CardBrandSpinnerMainBinding.bind(view)) == null) {
                inflate = CardBrandSpinnerMainBinding.inflate(this.layoutInflater, parent, false);
            }
            Intrinsics.checkNotNullExpressionValue(inflate, "convertView?.let {\n     …tInflater, parent, false)");
            Object item = getItem(i);
            if (item != null) {
                Intrinsics.checkNotNullExpressionValue(item, "requireNotNull(getItem(position))");
                CardBrand cardBrand = (CardBrand) item;
                AppCompatImageView appCompatImageView = inflate.image;
                appCompatImageView.setImageDrawable(createCardBrandDrawable(cardBrand));
                appCompatImageView.setContentDescription(cardBrand.getDisplayName());
                AppCompatImageView root = inflate.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "viewBinding.root");
                return root;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final void setTintColor$payments_core_release(int i) {
            this.tintColor = i;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardBrandSpinner(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final CardBrand getCardBrand() {
        return (CardBrand) getSelectedItem();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        List listOf;
        super.onFinishInflate();
        this.defaultBackground = getBackground();
        listOf = CollectionsKt__CollectionsJVMKt.listOf(CardBrand.Unknown);
        setCardBrands(listOf);
    }

    public final /* synthetic */ void setCardBrands(List cardBrands) {
        Intrinsics.checkNotNullParameter(cardBrands, "cardBrands");
        this.cardBrandsAdapter.clear();
        this.cardBrandsAdapter.addAll(cardBrands);
        this.cardBrandsAdapter.notifyDataSetChanged();
        setSelection(0);
        if (cardBrands.size() > 1) {
            setClickable(true);
            setEnabled(true);
            setBackground(this.defaultBackground);
            return;
        }
        setClickable(false);
        setEnabled(false);
        setBackgroundColor(NA0.m94301c(getContext(), 17170445));
    }

    public final void setTintColor(int i) {
        this.cardBrandsAdapter.setTintColor$payments_core_release(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardBrandSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CardBrandSpinner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C50553vf4.spinnerStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardBrandSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Adapter adapter = new Adapter(context);
        this.cardBrandsAdapter = adapter;
        setAdapter((SpinnerAdapter) adapter);
        setDropDownWidth(getResources().getDimensionPixelSize(C18606R.dimen.card_brand_spinner_dropdown_width));
    }
}
