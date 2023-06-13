.class public final synthetic Luf6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBX5$a;


# instance fields
.field public final synthetic a:Lyf6;

.field public final synthetic b:LT96;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lyf6;LT96;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luf6;->a:Lyf6;

    iput-object p2, p0, Luf6;->b:LT96;

    iput-wide p3, p0, Luf6;->c:J

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Luf6;->a:Lyf6;

    iget-object v1, p0, Luf6;->b:LT96;

    iget-wide v2, p0, Luf6;->c:J

    invoke-static {v0, v1, v2, v3}, Lyf6;->f(Lyf6;LT96;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
