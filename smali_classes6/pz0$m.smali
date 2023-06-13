.class public Lpz0$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LId3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpz0;->b(LFb6;)LId3;
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


# instance fields
.field public final synthetic a:Lb52;

.field public final synthetic b:Ljava/lang/reflect/Type;

.field public final synthetic c:Lpz0;


# direct methods
.method public constructor <init>(Lpz0;Lb52;Ljava/lang/reflect/Type;)V
    .locals 0

    iput-object p1, p0, Lpz0$m;->c:Lpz0;

    iput-object p2, p0, Lpz0$m;->a:Lb52;

    iput-object p3, p0, Lpz0$m;->b:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lpz0$m;->a:Lb52;

    iget-object v1, p0, Lpz0$m;->b:Ljava/lang/reflect/Type;

    invoke-interface {v0, v1}, Lb52;->a(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
