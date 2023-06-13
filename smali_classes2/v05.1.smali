.class public final synthetic Lv05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li25;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Li25;Lco/bird/android/model/wire/WireBird;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv05;->b:Li25;

    iput-object p2, p0, Lv05;->c:Lco/bird/android/model/wire/WireBird;

    iput-boolean p3, p0, Lv05;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv05;->b:Li25;

    iget-object v1, p0, Lv05;->c:Lco/bird/android/model/wire/WireBird;

    iget-boolean v2, p0, Lv05;->d:Z

    invoke-static {v0, v1, v2}, Li25;->e2(Li25;Lco/bird/android/model/wire/WireBird;Z)V

    return-void
.end method
