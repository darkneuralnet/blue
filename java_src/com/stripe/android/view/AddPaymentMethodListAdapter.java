package com.stripe.android.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.C18606R;
import com.stripe.android.databinding.BankItemBinding;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.view.AddPaymentMethodListAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B1\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u001e¢\u0006\u0004\b0\u00101J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0010¨\u00063"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "position", "", "getItemId", "holder", "", "onBindViewHolder", "updateSelected$payments_core_release", "(I)V", "updateSelected", "notifyAdapterItemChanged", "Lcom/stripe/android/view/ThemeConfig;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "getThemeConfig", "()Lcom/stripe/android/view/ThemeConfig;", "", "Lcom/stripe/android/view/Bank;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lkotlin/Function1;", "itemSelectedCallback", "Lkotlin/jvm/functions/Function1;", "getItemSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "Lcom/stripe/android/model/BankStatuses;", "bankStatuses", "Lcom/stripe/android/model/BankStatuses;", "getBankStatuses$payments_core_release", "()Lcom/stripe/android/model/BankStatuses;", "setBankStatuses$payments_core_release", "(Lcom/stripe/android/model/BankStatuses;)V", "value", "selectedPosition", "I", "getSelectedPosition", "()I", "setSelectedPosition", "<init>", "(Lcom/stripe/android/view/ThemeConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "BankViewHolder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AddPaymentMethodListAdapter extends RecyclerView.AbstractC11843h<RecyclerView.AbstractC11834D> {
    private BankStatuses bankStatuses;
    private final Function1<Integer, Unit> itemSelectedCallback;
    private final List<Bank> items;
    private int selectedPosition;
    private final ThemeConfig themeConfig;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$D;", "Lcom/stripe/android/view/Bank;", "bank", "", "isOnline", "", "update", "isSelected", "setSelected$payments_core_release", "(Z)V", "setSelected", "Lcom/stripe/android/databinding/BankItemBinding;", "viewBinding", "Lcom/stripe/android/databinding/BankItemBinding;", "Lcom/stripe/android/view/ThemeConfig;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "Landroid/content/res/Resources;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/stripe/android/databinding/BankItemBinding;Lcom/stripe/android/view/ThemeConfig;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAddPaymentMethodListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethodListAdapter.kt\ncom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,110:1\n262#2,2:111\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethodListAdapter.kt\ncom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder\n*L\n106#1:111,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class BankViewHolder extends RecyclerView.AbstractC11834D {
        private final Resources resources;
        private final ThemeConfig themeConfig;
        private final BankItemBinding viewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankViewHolder(BankItemBinding viewBinding, ThemeConfig themeConfig) {
            super(viewBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
            Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
            this.viewBinding = viewBinding;
            this.themeConfig = themeConfig;
            Resources resources = this.itemView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "itemView.resources");
            this.resources = resources;
        }

        public final void setSelected$payments_core_release(boolean z) {
            int i;
            this.viewBinding.name.setTextColor(this.themeConfig.getTextColor$payments_core_release(z));
            C51668xY1.m5035c(this.viewBinding.checkIcon, ColorStateList.valueOf(this.themeConfig.getTintColor$payments_core_release(z)));
            AppCompatImageView appCompatImageView = this.viewBinding.checkIcon;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "viewBinding.checkIcon");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            appCompatImageView.setVisibility(i);
        }

        public final void update(Bank bank, boolean z) {
            String string;
            Intrinsics.checkNotNullParameter(bank, "bank");
            AppCompatTextView appCompatTextView = this.viewBinding.name;
            if (z) {
                string = bank.getDisplayName();
            } else {
                string = this.resources.getString(C18606R.string.fpx_bank_offline, bank.getDisplayName());
            }
            appCompatTextView.setText(string);
            Integer brandIconResId = bank.getBrandIconResId();
            if (brandIconResId != null) {
                this.viewBinding.icon.setImageResource(brandIconResId.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddPaymentMethodListAdapter(ThemeConfig themeConfig, List<? extends Bank> items, Function1<? super Integer, Unit> itemSelectedCallback) {
        Intrinsics.checkNotNullParameter(themeConfig, "themeConfig");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemSelectedCallback, "itemSelectedCallback");
        this.themeConfig = themeConfig;
        this.items = items;
        this.itemSelectedCallback = itemSelectedCallback;
        this.selectedPosition = -1;
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AddPaymentMethodListAdapter this$0, RecyclerView.AbstractC11834D holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        this$0.setSelectedPosition(holder.getBindingAdapterPosition());
    }

    public final BankStatuses getBankStatuses$payments_core_release() {
        return this.bankStatuses;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        return i;
    }

    public final Function1<Integer, Unit> getItemSelectedCallback() {
        return this.itemSelectedCallback;
    }

    public final List<Bank> getItems() {
        return this.items;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final ThemeConfig getThemeConfig() {
        return this.themeConfig;
    }

    public final void notifyAdapterItemChanged(int i) {
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(final RecyclerView.AbstractC11834D holder, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Bank bank = this.items.get(i);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: r7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddPaymentMethodListAdapter.onBindViewHolder$lambda$0(AddPaymentMethodListAdapter.this, holder, view);
            }
        });
        BankViewHolder bankViewHolder = (BankViewHolder) holder;
        boolean z2 = true;
        if (i == this.selectedPosition) {
            z = true;
        } else {
            z = false;
        }
        bankViewHolder.setSelected$payments_core_release(z);
        BankStatuses bankStatuses = this.bankStatuses;
        if (bankStatuses != null) {
            z2 = bankStatuses.isOnline$payments_core_release(bank);
        }
        bankViewHolder.update(bank, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public RecyclerView.AbstractC11834D onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        BankItemBinding inflate = BankItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …      false\n            )");
        return new BankViewHolder(inflate, this.themeConfig);
    }

    public final void setBankStatuses$payments_core_release(BankStatuses bankStatuses) {
        this.bankStatuses = bankStatuses;
    }

    public final void setSelectedPosition(int i) {
        int i2 = this.selectedPosition;
        if (i != i2) {
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
            notifyItemChanged(i);
            this.itemSelectedCallback.invoke(Integer.valueOf(i));
        }
        this.selectedPosition = i;
    }

    public final void updateSelected$payments_core_release(int i) {
        setSelectedPosition(i);
        notifyItemChanged(i);
    }
}
