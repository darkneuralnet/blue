.class public final Lj49;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public final d:LN89;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LN89;->a()LN89;

    move-result-object v0

    iput-object v0, p0, Lj49;->d:LN89;

    return-void
.end method

.method public constructor <init>(LN89;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj49;->d:LN89;

    return-void
.end method
