.class public final Lco/bird/android/app/feature/autopay/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/autopay/d;


# instance fields
.field public final a:Lco/bird/android/app/feature/autopay/f;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/autopay/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/autopay/e;->a:Lco/bird/android/app/feature/autopay/f;

    return-void
.end method

.method public static b(Lco/bird/android/app/feature/autopay/f;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/autopay/f;",
            ")",
            "LY94<",
            "Lco/bird/android/app/feature/autopay/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/autopay/e;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/autopay/e;-><init>(Lco/bird/android/app/feature/autopay/f;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;Lco/bird/android/app/feature/autopay/b$a;)Lco/bird/android/app/feature/autopay/c;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/e;->a:Lco/bird/android/app/feature/autopay/f;

    invoke-virtual {v0, p1, p2, p3}, Lco/bird/android/app/feature/autopay/f;->b(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;Lco/bird/android/app/feature/autopay/b$a;)Lco/bird/android/app/feature/autopay/c;

    move-result-object p1

    return-object p1
.end method
