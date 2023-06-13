.class public final Lq78;
.super Lg28;
.source "SourceFile"


# instance fields
.field public final a:Ldj8;

.field public final b:Ljava/lang/Object;

.field public final c:Ldj8;

.field public final d:Lb78;


# direct methods
.method public constructor <init>(Ldj8;Ljava/lang/Object;Ldj8;Lb78;Ljava/lang/Class;)V
    .locals 1

    invoke-direct {p0}, Lg28;-><init>()V

    if-eqz p1, :cond_2

    iget-object p5, p4, Lb78;->c:Lvx8;

    sget-object v0, Lvx8;->m:Lvx8;

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
    iput-object p1, p0, Lq78;->a:Ldj8;

    iput-object p2, p0, Lq78;->b:Ljava/lang/Object;

    iput-object p3, p0, Lq78;->c:Ldj8;

    iput-object p4, p0, Lq78;->d:Lb78;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null containingTypeDefaultInstance"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
