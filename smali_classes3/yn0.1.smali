.class public final synthetic Lyn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LOn0;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(LOn0;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyn0;->b:LOn0;

    iput-object p2, p0, Lyn0;->c:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lyn0;->b:LOn0;

    iget-object v1, p0, Lyn0;->c:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LOn0;->o(LOn0;Lco/bird/android/model/wire/WireBird;)V

    return-void
.end method
