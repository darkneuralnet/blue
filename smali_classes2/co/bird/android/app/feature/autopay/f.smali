.class public final Lco/bird/android/app/feature/autopay/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lco/bird/android/app/feature/autopay/f;
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/autopay/f;

    invoke-direct {v0}, Lco/bird/android/app/feature/autopay/f;-><init>()V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;Lco/bird/android/app/feature/autopay/b$a;)Lco/bird/android/app/feature/autopay/c;
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/autopay/c;

    invoke-direct {v0, p0, p1, p2}, Lco/bird/android/app/feature/autopay/c;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;Lco/bird/android/app/feature/autopay/b$a;)V

    return-object v0
.end method


# virtual methods
.method public b(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;Lco/bird/android/app/feature/autopay/b$a;)Lco/bird/android/app/feature/autopay/c;
    .locals 0

    invoke-static {p1, p2, p3}, Lco/bird/android/app/feature/autopay/f;->c(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;Lco/bird/android/app/feature/autopay/b$a;)Lco/bird/android/app/feature/autopay/c;

    move-result-object p1

    return-object p1
.end method
