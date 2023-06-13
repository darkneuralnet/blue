.class public final synthetic LkA6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Lco/bird/android/feature/webview/c;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lco/bird/android/feature/webview/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkA6;->b:Ljava/util/Map;

    iput-object p2, p0, LkA6;->c:Lco/bird/android/feature/webview/c;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LkA6;->b:Ljava/util/Map;

    iget-object v1, p0, LkA6;->c:Lco/bird/android/feature/webview/c;

    invoke-static {v0, v1}, Lco/bird/android/feature/webview/c$d;->a(Ljava/util/Map;Lco/bird/android/feature/webview/c;)Lco/bird/android/buava/Optional;

    move-result-object v0

    return-object v0
.end method
