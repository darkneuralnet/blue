.class public final synthetic LoQ1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/IdToolOption;

.field public final synthetic c:LpQ1;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/IdToolOption;LpQ1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoQ1;->b:Lco/bird/android/model/IdToolOption;

    iput-object p2, p0, LoQ1;->c:LpQ1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LoQ1;->b:Lco/bird/android/model/IdToolOption;

    iget-object v1, p0, LoQ1;->c:LpQ1;

    invoke-static {v0, v1}, LpQ1;->m(Lco/bird/android/model/IdToolOption;LpQ1;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
