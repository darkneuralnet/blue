.class public final Lco/bird/android/feature/operator/releaseassignment/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/operator/releaseassignment/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/operator/releaseassignment/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LDO0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/operator/releaseassignment/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Landroid/app/Activity;)Lco/bird/android/feature/operator/releaseassignment/b;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lco/bird/android/feature/operator/releaseassignment/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lco/bird/android/feature/operator/releaseassignment/a$b;-><init>(LlG2;Landroid/app/Activity;LEO0;)V

    return-object v0
.end method
