.class public final Lma3$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lma3$b$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0007H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR!\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000b\u0010\u0011R!\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0011R!\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0010\u001a\u0004\u0008\u0016\u0010\u0011\u00a8\u0006\u001c"
    }
    d2 = {
        "Lma3$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LOT3;",
        "Lco/bird/android/model/OperatorNotification;",
        "notification",
        "j",
        "LLd2;",
        "b",
        "LLd2;",
        "binding",
        "",
        "c",
        "Lkotlin/Lazy;",
        "()[LOT3;",
        "circlePins",
        "d",
        "e",
        "squarePins",
        "i",
        "teardropPins",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lma3;Landroid/view/View;)V",
        "notification-center_release"
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
        "SMAP\nNotificationCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapter$NotificationViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n18#2:156\n9#3,4:157\n1#4:161\n13579#5,2:162\n13579#5,2:164\n13579#5,2:166\n*S KotlinDebug\n*F\n+ 1 NotificationCenterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapter$NotificationViewHolder\n*L\n109#1:156\n109#1:157,4\n120#1:162,2\n127#1:164,2\n134#1:166,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LLd2;

.field public final c:Lkotlin/Lazy;

.field public final d:Lkotlin/Lazy;

.field public final e:Lkotlin/Lazy;

.field public final synthetic f:Lma3;


# direct methods
.method public constructor <init>(Lma3;Landroid/view/View;)V
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

    iput-object p1, p0, Lma3$b;->f:Lma3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LLd2;->a(Landroid/view/View;)LLd2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lma3$b;->b:LLd2;

    new-instance v0, Lma3$b$c;

    invoke-direct {v0, p0}, Lma3$b$c;-><init>(Lma3$b;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lma3$b;->c:Lkotlin/Lazy;

    new-instance v0, Lma3$b$d;

    invoke-direct {v0, p0}, Lma3$b$d;-><init>(Lma3$b;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lma3$b;->d:Lkotlin/Lazy;

    new-instance v0, Lma3$b$e;

    invoke-direct {v0, p0}, Lma3$b$e;-><init>(Lma3$b;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lma3$b;->e:Lkotlin/Lazy;

    invoke-virtual {p2}, LLd2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lma3$b$a;

    invoke-direct {v0, p1, p0}, Lma3$b$a;-><init>(Lma3;Lma3$b;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(Lma3$b;)LLd2;
    .locals 0

    iget-object p0, p0, Lma3$b;->b:LLd2;

    return-object p0
.end method


# virtual methods
.method public final b()[LOT3;
    .locals 1

    iget-object v0, p0, Lma3$b;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LOT3;

    return-object v0
.end method

.method public bind(I)V
    .locals 5

    iget-object v0, p0, Lma3$b;->f:Lma3;

    invoke-static {v0}, Lma3;->access$getAdapterData(Lma3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/OperatorNotification;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lma3$b;->b:LLd2;

    iget-object v1, v1, LLd2;->e:Landroid/widget/TextView;

    invoke-interface {v0}, Lco/bird/android/model/OperatorNotification;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lma3$b;->b:LLd2;

    iget-object v1, v1, LLd2;->b:Landroid/widget/TextView;

    invoke-interface {v0}, Lco/bird/android/model/OperatorNotification;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lma3$b;->b:LLd2;

    iget-object v1, v1, LLd2;->d:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lma3$b;->b:LLd2;

    iget-object p1, p1, LLd2;->c:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-interface {v0}, Lco/bird/android/model/OperatorNotification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getPinShape()Lco/bird/android/model/constant/NotificationIconPinShape;

    move-result-object p1

    sget-object v1, Lma3$b$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    goto :goto_4

    :cond_1
    instance-of p1, v0, Lco/bird/android/model/OperatorNotification$NotificationGroup;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lma3$b;->i()[LOT3;

    move-result-object p1

    array-length v1, p1

    :goto_1
    if-ge v2, v1, :cond_7

    aget-object v3, p1, v2

    const-string v4, "teardropPin"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3, v0}, Lma3$b;->j(LOT3;Lco/bird/android/model/OperatorNotification;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lma3$b;->i()[LOT3;

    move-result-object p1

    aget-object p1, p1, v2

    const-string v1, "teardropPins[0]"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lma3$b;->j(LOT3;Lco/bird/android/model/OperatorNotification;)V

    goto :goto_4

    :cond_3
    instance-of p1, v0, Lco/bird/android/model/OperatorNotification$NotificationGroup;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lma3$b;->e()[LOT3;

    move-result-object p1

    array-length v1, p1

    :goto_2
    if-ge v2, v1, :cond_7

    aget-object v3, p1, v2

    const-string v4, "squarePin"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3, v0}, Lma3$b;->j(LOT3;Lco/bird/android/model/OperatorNotification;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lma3$b;->e()[LOT3;

    move-result-object p1

    aget-object p1, p1, v2

    const-string v1, "squarePins[0]"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lma3$b;->j(LOT3;Lco/bird/android/model/OperatorNotification;)V

    goto :goto_4

    :cond_5
    instance-of p1, v0, Lco/bird/android/model/OperatorNotification$NotificationGroup;

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lma3$b;->b()[LOT3;

    move-result-object p1

    array-length v1, p1

    :goto_3
    if-ge v2, v1, :cond_7

    aget-object v3, p1, v2

    invoke-virtual {p0, v3, v0}, Lma3$b;->j(LOT3;Lco/bird/android/model/OperatorNotification;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lma3$b;->b()[LOT3;

    move-result-object p1

    aget-object p1, p1, v2

    invoke-virtual {p0, p1, v0}, Lma3$b;->j(LOT3;Lco/bird/android/model/OperatorNotification;)V

    :cond_7
    :goto_4
    return-void
.end method

.method public final e()[LOT3;
    .locals 1

    iget-object v0, p0, Lma3$b;->d:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LOT3;

    return-object v0
.end method

.method public final i()[LOT3;
    .locals 1

    iget-object v0, p0, Lma3$b;->e:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LOT3;

    return-object v0
.end method

.method public final j(LOT3;Lco/bird/android/model/OperatorNotification;)V
    .locals 3

    iget-object v0, p1, LOT3;->c:Lco/bird/android/widget/FleetMarkerPin;

    invoke-interface {p2}, Lco/bird/android/model/OperatorNotification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/FleetMarkerPin;->setColor(I)V

    iget-object v0, p1, LOT3;->b:Landroid/widget/ImageView;

    invoke-interface {p2}, Lco/bird/android/model/OperatorNotification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v1

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p1, LOT3;->b:Landroid/widget/ImageView;

    invoke-interface {p2}, Lco/bird/android/model/OperatorNotification;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p2

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p1}, LOT3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    iget-object v0, p0, Lma3$b;->b:LLd2;

    iget-object v0, v0, LLd2;->c:Landroid/widget/FrameLayout;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lma3$b;->b:LLd2;

    iget-object p2, p2, LLd2;->c:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, LOT3;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method
