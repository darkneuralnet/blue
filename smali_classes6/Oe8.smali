.class public final synthetic LOe8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:LAt8;


# direct methods
.method public synthetic constructor <init>(LAt8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOe8;->a:LAt8;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;ILfI8;)Lz59;
    .locals 1

    iget-object v0, p0, LOe8;->a:LAt8;

    check-cast p1, LU18;

    invoke-virtual {v0, p1, p2, p3}, LAt8;->m(LU18;ILfI8;)Lz59;

    move-result-object p1

    return-object p1
.end method
