.class public final synthetic LWu5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LZu5;

.field public final synthetic c:Lco/bird/android/model/wire/WireServiceCenterStatus;


# direct methods
.method public synthetic constructor <init>(LZu5;Lco/bird/android/model/wire/WireServiceCenterStatus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWu5;->b:LZu5;

    iput-object p2, p0, LWu5;->c:Lco/bird/android/model/wire/WireServiceCenterStatus;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LWu5;->b:LZu5;

    iget-object v1, p0, LWu5;->c:Lco/bird/android/model/wire/WireServiceCenterStatus;

    invoke-static {v0, v1}, LZu5;->m(LZu5;Lco/bird/android/model/wire/WireServiceCenterStatus;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
