.class public final Lhb9;
.super Lx89;
.source "SourceFile"


# instance fields
.field public final a:Lpg9;

.field public final b:Ljava/lang/Object;

.field public final c:Lpg9;

.field public final d:Lab9;


# direct methods
.method public constructor <init>(Lpg9;Ljava/lang/Object;Lpg9;Lab9;Ljava/lang/Class;)V
    .locals 1

    invoke-direct {p0}, Lx89;-><init>()V

    if-eqz p1, :cond_2

    iget-object p5, p4, Lab9;->d:Lfn9;

    sget-object v0, Lfn9;->m:Lfn9;

    if-ne p5, v0, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null messageDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lhb9;->a:Lpg9;

    iput-object p2, p0, Lhb9;->b:Ljava/lang/Object;

    iput-object p3, p0, Lhb9;->c:Lpg9;

    iput-object p4, p0, Lhb9;->d:Lab9;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null containingTypeDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
