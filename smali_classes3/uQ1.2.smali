.class public final synthetic LuQ1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lco/bird/android/model/IdToolOption;

.field public final synthetic d:LwQ1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lco/bird/android/model/IdToolOption;LwQ1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuQ1;->b:Ljava/lang/String;

    iput-object p2, p0, LuQ1;->c:Lco/bird/android/model/IdToolOption;

    iput-object p3, p0, LuQ1;->d:LwQ1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LuQ1;->b:Ljava/lang/String;

    iget-object v1, p0, LuQ1;->c:Lco/bird/android/model/IdToolOption;

    iget-object v2, p0, LuQ1;->d:LwQ1;

    invoke-static {v0, v1, v2}, LwQ1;->m(Ljava/lang/String;Lco/bird/android/model/IdToolOption;LwQ1;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
