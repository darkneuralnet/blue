.class public final synthetic LSp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/wire/WireLocation;

.field public final synthetic c:LZp;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireLocation;LZp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSp;->b:Lco/bird/android/model/wire/WireLocation;

    iput-object p2, p0, LSp;->c:LZp;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LSp;->b:Lco/bird/android/model/wire/WireLocation;

    iget-object v1, p0, LSp;->c:LZp;

    invoke-static {v0, v1}, LZp;->h(Lco/bird/android/model/wire/WireLocation;LZp;)Lco/bird/android/buava/Optional;

    move-result-object v0

    return-object v0
.end method
