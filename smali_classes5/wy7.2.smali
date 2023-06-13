.class public final Lwy7;
.super LPA7;
.source "SourceFile"


# instance fields
.field public final synthetic f:LkF7;


# direct methods
.method public constructor <init>(LkF7;)V
    .locals 1

    iput-object p1, p0, Lwy7;->f:LkF7;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LPA7;-><init>(LkF7;LaA7;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwy7;->f:LkF7;

    iget-object v0, v0, LkF7;->e:[Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    aget-object p1, v0, p1

    return-object p1
.end method
