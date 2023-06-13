.class public LeZ1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LeZ1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J


# instance fields
.field public final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TE;>;"
        }
    .end annotation
.end field

.field public final c:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TE;>;[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeZ1$b;->b:Ljava/util/Comparator;

    iput-object p2, p0, LeZ1$b;->c:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public readResolve()Ljava/lang/Object;
    .locals 2

    new-instance v0, LeZ1$a;

    iget-object v1, p0, LeZ1$b;->b:Ljava/util/Comparator;

    invoke-direct {v0, v1}, LeZ1$a;-><init>(Ljava/util/Comparator;)V

    iget-object v1, p0, LeZ1$b;->c:[Ljava/lang/Object;

    invoke-virtual {v0, v1}, LeZ1$a;->m([Ljava/lang/Object;)LeZ1$a;

    move-result-object v0

    invoke-virtual {v0}, LeZ1$a;->n()LeZ1;

    move-result-object v0

    return-object v0
.end method
