.class public final synthetic LkY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LAY;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(LAY;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkY;->b:LAY;

    iput-object p2, p0, LkY;->c:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LkY;->b:LAY;

    iget-object v1, p0, LkY;->c:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LAY;->p(LAY;Lco/bird/android/model/wire/WireBird;)V

    return-void
.end method
