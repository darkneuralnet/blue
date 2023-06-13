.class public final Lqd2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Lcom/airbnb/lottie/LottieAnimationView;

.field public final b:Lcom/airbnb/lottie/LottieAnimationView;


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqd2;->a:Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p2, p0, Lqd2;->b:Lcom/airbnb/lottie/LottieAnimationView;

    return-void
.end method

.method public static a(Landroid/view/View;)Lqd2;
    .locals 1

    if-eqz p0, :cond_0

    check-cast p0, Lcom/airbnb/lottie/LottieAnimationView;

    new-instance v0, Lqd2;

    invoke-direct {v0, p0, p0}, Lqd2;-><init>(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()Lcom/airbnb/lottie/LottieAnimationView;
    .locals 1

    iget-object v0, p0, Lqd2;->a:Lcom/airbnb/lottie/LottieAnimationView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lqd2;->b()Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object v0

    return-object v0
.end method
