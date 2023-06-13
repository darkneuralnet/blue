.class public Lc21;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LET;

.field public final b:[LfN4;


# direct methods
.method public constructor <init>(LET;[LfN4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc21;->a:LET;

    iput-object p2, p0, Lc21;->b:[LfN4;

    return-void
.end method


# virtual methods
.method public final a()LET;
    .locals 1

    iget-object v0, p0, Lc21;->a:LET;

    return-object v0
.end method

.method public final b()[LfN4;
    .locals 1

    iget-object v0, p0, Lc21;->b:[LfN4;

    return-object v0
.end method
