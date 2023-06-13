.class public final Lwh7;
.super Lek7;
.source "SourceFile"


# instance fields
.field public final synthetic f:LMn7;


# direct methods
.method public constructor <init>(LMn7;)V
    .locals 1

    iput-object p1, p0, Lwh7;->f:LMn7;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lek7;-><init>(LMn7;Lyg7;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(I)Ljava/lang/Object;
    .locals 2

    new-instance v0, LXl7;

    iget-object v1, p0, Lwh7;->f:LMn7;

    invoke-direct {v0, v1, p1}, LXl7;-><init>(LMn7;I)V

    return-object v0
.end method
