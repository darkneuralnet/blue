.class public final Lco/bird/android/core/mvp/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/core/mvp/BaseActivity$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/core/mvp/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:LlG2;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LPG0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/core/mvp/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LlG2;)Lco/bird/android/core/mvp/BaseActivity$a$a;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/core/mvp/a$b;->b(LlG2;)Lco/bird/android/core/mvp/a$b;

    move-result-object p1

    return-object p1
.end method

.method public b(LlG2;)Lco/bird/android/core/mvp/a$b;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LlG2;

    iput-object p1, p0, Lco/bird/android/core/mvp/a$b;->a:LlG2;

    return-object p0
.end method

.method public build()Lco/bird/android/core/mvp/BaseActivity$a;
    .locals 3

    iget-object v0, p0, Lco/bird/android/core/mvp/a$b;->a:LlG2;

    const-class v1, LlG2;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lco/bird/android/core/mvp/a$a;

    iget-object v1, p0, Lco/bird/android/core/mvp/a$b;->a:LlG2;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/bird/android/core/mvp/a$a;-><init>(LlG2;LOG0;)V

    return-object v0
.end method
