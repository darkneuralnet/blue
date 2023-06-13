.class public final synthetic LSJ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LTJ4;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(LTJ4;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSJ4;->b:LTJ4;

    iput-object p2, p0, LSJ4;->c:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LSJ4;->b:LTJ4;

    iget-object v1, p0, LSJ4;->c:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LTJ4;->D(LTJ4;Lco/bird/android/model/wire/WireBird;)V

    return-void
.end method
