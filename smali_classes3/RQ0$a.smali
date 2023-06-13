.class public final LRQ0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LhU5$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRQ0;
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

.method public synthetic constructor <init>(LQQ0;)V
    .locals 0

    invoke-direct {p0}, LRQ0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LlG2;Lco/bird/android/model/PhotoBannerViewModel;)LhU5;
    .locals 2

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LRQ0$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LRQ0$b;-><init>(LlG2;Lco/bird/android/model/PhotoBannerViewModel;LSQ0;)V

    return-object v0
.end method
