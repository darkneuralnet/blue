.class public final synthetic Lpf6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBX5$a;


# instance fields
.field public final synthetic a:Lyf6;

.field public final synthetic b:LT96;


# direct methods
.method public synthetic constructor <init>(Lyf6;LT96;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpf6;->a:Lyf6;

    iput-object p2, p0, Lpf6;->b:LT96;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpf6;->a:Lyf6;

    iget-object v1, p0, Lpf6;->b:LT96;

    invoke-static {v0, v1}, Lyf6;->d(Lyf6;LT96;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method
