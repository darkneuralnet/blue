.class public final synthetic Lab6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lco/bird/android/config/tweaks/dsl/Tweaks;

.field public final synthetic d:Lbb6;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/config/tweaks/dsl/Tweaks;Lbb6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab6;->b:Ljava/lang/String;

    iput-object p2, p0, Lab6;->c:Lco/bird/android/config/tweaks/dsl/Tweaks;

    iput-object p3, p0, Lab6;->d:Lbb6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lab6;->b:Ljava/lang/String;

    iget-object v1, p0, Lab6;->c:Lco/bird/android/config/tweaks/dsl/Tweaks;

    iget-object v2, p0, Lab6;->d:Lbb6;

    invoke-static {v0, v1, v2}, Lbb6;->b(Ljava/lang/String;Lco/bird/android/config/tweaks/dsl/Tweaks;Lbb6;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
