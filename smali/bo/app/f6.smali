.class public abstract Lbo/app/f6;
.super Lbo/app/d6;
.source "SourceFile"

# interfaces
.implements Lbo/app/v2;


# instance fields
.field private e:Ls20;


# direct methods
.method public constructor <init>(Ls20;Lbo/app/u1;)V
    .locals 0

    invoke-direct {p0, p2}, Lbo/app/d6;-><init>(Lbo/app/u1;)V

    iput-object p1, p0, Lbo/app/f6;->e:Ls20;

    return-void
.end method


# virtual methods
.method public c()Ls20;
    .locals 1

    iget-object v0, p0, Lbo/app/f6;->e:Ls20;

    return-object v0
.end method
