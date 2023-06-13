.class public final synthetic LvL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/wire/WireBirdEvent;

.field public final synthetic c:LwL;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireBirdEvent;LwL;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvL;->b:Lco/bird/android/model/wire/WireBirdEvent;

    iput-object p2, p0, LvL;->c:LwL;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LvL;->b:Lco/bird/android/model/wire/WireBirdEvent;

    iget-object v1, p0, LvL;->c:LwL;

    invoke-static {v0, v1}, LwL;->d(Lco/bird/android/model/wire/WireBirdEvent;LwL;)V

    return-void
.end method
