.class public final synthetic LI05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li25;

.field public final synthetic c:Z

.field public final synthetic d:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(Li25;ZLco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI05;->b:Li25;

    iput-boolean p2, p0, LI05;->c:Z

    iput-object p3, p0, LI05;->d:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LI05;->b:Li25;

    iget-boolean v1, p0, LI05;->c:Z

    iget-object v2, p0, LI05;->d:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1, v2}, Li25;->F0(Li25;ZLco/bird/android/model/wire/WireBird;)V

    return-void
.end method
