.class public final Lpi7;
.super Lek7;
.source "SourceFile"


# instance fields
.field public final synthetic f:LMn7;


# direct methods
.method public constructor <init>(LMn7;)V
    .locals 1

    iput-object p1, p0, Lpi7;->f:LMn7;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lek7;-><init>(LMn7;Lyg7;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpi7;->f:LMn7;

    invoke-static {v0, p1}, LMn7;->l(LMn7;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
