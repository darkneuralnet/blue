.class public Lpz0$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LId3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpz0;->d(Ljava/lang/reflect/Type;Ljava/lang/Class;)LId3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LId3<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    new-instance v0, LUr2;

    invoke-direct {v0}, LUr2;-><init>()V

    return-object v0
.end method
