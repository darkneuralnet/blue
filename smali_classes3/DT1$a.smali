.class public final LDT1$a;
.super Lh0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDT1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDT1$a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "LDT1$a;",
        "Lh0;",
        "",
        "position",
        "",
        "bind",
        "Landroid/view/View;",
        "f",
        "Landroid/view/View;",
        "view",
        "Lcc2;",
        "g",
        "Lcc2;",
        "binding",
        "<init>",
        "(LDT1;Landroid/view/View;)V",
        "co.bird.android.feature.identification"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n180#4:244\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder\n*L\n166#1:239\n166#1:240,4\n199#1:244\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Landroid/view/View;

.field public final g:Lcc2;

.field public final synthetic h:LDT1;


# direct methods
.method public constructor <init>(LDT1;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDT1$a;->h:LDT1;

    invoke-direct {p0, p2}, Lh0;-><init>(Landroid/view/View;)V

    iput-object p2, p0, LDT1$a;->f:Landroid/view/View;

    invoke-static {p2}, Lcc2;->a(Landroid/view/View;)Lcc2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LDT1$a;->g:Lcc2;

    iget-object p2, p2, Lcc2;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p2}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance v0, LDT1$a$a;

    invoke-direct {v0, p1, p0}, LDT1$a$a;-><init>(LDT1;LDT1$a;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LDT1$a;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic r(LDT1$a;)Lcc2;
    .locals 0

    iget-object p0, p0, LDT1$a;->g:Lcc2;

    return-object p0
.end method

.method public static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 8

    invoke-super {p0, p1}, Lh0;->bind(I)V

    iget-object v0, p0, LDT1$a;->h:LDT1;

    invoke-static {v0}, LDT1;->access$getAdapterData(LDT1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LlT1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LlT1;

    const/4 v0, 0x2

    const/4 v2, 0x0

    if-eqz p1, :cond_7

    iget-object v3, p0, LDT1$a;->g:Lcc2;

    iget-object v3, v3, Lcc2;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, LlT1;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LDT1$a;->g:Lcc2;

    iget-object v3, v3, Lcc2;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, LlT1;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LDT1$a;->g:Lcc2;

    iget-object v3, v3, Lcc2;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p1}, LlT1;->c()Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    move-result-object v4

    invoke-static {v4}, LET1;->b(Lco/bird/android/model/identification/IdentificationManualEntryFormField;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    invoke-virtual {p1}, LlT1;->c()Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    move-result-object v3

    sget-object v4, LDT1$a$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-eq v3, v5, :cond_2

    if-eq v3, v0, :cond_2

    if-eq v3, v4, :cond_2

    const/4 v6, 0x4

    if-eq v3, v6, :cond_1

    iget-object v3, p0, LDT1$a;->g:Lcc2;

    iget-object v3, v3, Lcc2;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setInputType(I)V

    goto :goto_1

    :cond_1
    iget-object v3, p0, LDT1$a;->g:Lcc2;

    iget-object v3, v3, Lcc2;->b:Lcom/google/android/material/textfield/TextInputEditText;

    const/16 v6, 0x2000

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setInputType(I)V

    goto :goto_1

    :cond_2
    iget-object v3, p0, LDT1$a;->g:Lcc2;

    iget-object v3, v3, Lcc2;->b:Lcom/google/android/material/textfield/TextInputEditText;

    const/16 v6, 0x60

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setInputType(I)V

    :goto_1
    iget-object v3, p0, LDT1$a;->g:Lcc2;

    iget-object v3, v3, Lcc2;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p1}, LlT1;->c()Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    move-result-object v6

    new-array v4, v4, [Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    sget-object v7, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->DATE_OF_BIRTH:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    aput-object v7, v4, v2

    sget-object v7, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->EXPIRATION_DATE:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    aput-object v7, v4, v5

    sget-object v7, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->ISSUE_DATE:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    aput-object v7, v4, v0

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v6, v4}, LaZ;->a(Ljava/lang/Object;Ljava/util/List;)Z

    move-result v4

    xor-int/2addr v4, v5

    invoke-virtual {v3, v4}, Landroid/view/View;->setFocusable(Z)V

    iget-object v3, p0, LDT1$a;->g:Lcc2;

    iget-object v3, v3, Lcc2;->b:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p1}, LlT1;->e()Ljava/lang/Object;

    move-result-object p1

    instance-of v4, p1, Lorg/joda/time/DateTime;

    if-eqz v4, :cond_3

    check-cast p1, Lorg/joda/time/DateTime;

    invoke-virtual {p1}, Lorg/joda/time/DateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    instance-of v4, p1, Ljava/lang/String;

    if-eqz v4, :cond_4

    check-cast p1, Ljava/lang/String;

    goto :goto_2

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    move-object p1, v1

    :goto_2
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LDT1$a;->g:Lcc2;

    iget-object v3, p1, Lcc2;->b:Lcom/google/android/material/textfield/TextInputEditText;

    iget-object p1, p1, Lcc2;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    goto :goto_3

    :cond_6
    move p1, v2

    :goto_3
    invoke-virtual {v3, p1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_7
    iget-object p1, p0, LDT1$a;->g:Lcc2;

    iget-object p1, p1, Lcc2;->b:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v3, "binding.editText"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x12c

    invoke-static {p1, v3, v2, v0, v1}, Llf5;->textChanges$default(Landroid/widget/EditText;IZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, LDT1$a$c;

    iget-object v1, p0, LDT1$a;->h:LDT1;

    invoke-direct {v0, p0, v1}, LDT1$a$c;-><init>(LDT1$a;LDT1;)V

    new-instance v1, LCT1;

    invoke-direct {v1, v0}, LCT1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
