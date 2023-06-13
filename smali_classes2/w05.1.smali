.class public final synthetic Lw05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li25;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(Li25;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw05;->b:Li25;

    iput-object p2, p0, Lw05;->c:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw05;->b:Li25;

    iget-object v1, p0, Lw05;->c:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, Li25;->Q1(Li25;Lco/bird/android/model/wire/WireBird;)V

    return-void
.end method
