.class public final LnK6;
.super LjK6;
.source "SourceFile"


# instance fields
.field public final synthetic c:LjK6;

.field public final synthetic d:LzK6;


# direct methods
.method public constructor <init>(LzK6;LaO6;LjK6;)V
    .locals 0

    iput-object p1, p0, LnK6;->d:LzK6;

    iput-object p3, p0, LnK6;->c:LjK6;

    invoke-direct {p0, p2}, LjK6;-><init>(LaO6;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LnK6;->d:LzK6;

    iget-object v1, p0, LnK6;->c:LjK6;

    invoke-static {v0, v1}, LzK6;->d(LzK6;LjK6;)V

    return-void
.end method
