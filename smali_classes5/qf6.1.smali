.class public final synthetic Lqf6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBX5$a;


# instance fields
.field public final synthetic a:Lyf6;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:LT96;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lyf6;Ljava/lang/Iterable;LT96;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqf6;->a:Lyf6;

    iput-object p2, p0, Lqf6;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lqf6;->c:LT96;

    iput-wide p4, p0, Lqf6;->d:J

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lqf6;->a:Lyf6;

    iget-object v1, p0, Lqf6;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Lqf6;->c:LT96;

    iget-wide v3, p0, Lqf6;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lyf6;->e(Lyf6;Ljava/lang/Iterable;LT96;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
