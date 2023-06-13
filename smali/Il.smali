.class public final synthetic LIl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/appboy/Appboy;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/math/BigDecimal;

.field public final synthetic f:I

.field public final synthetic g:Ls20;


# direct methods
.method public synthetic constructor <init>(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILs20;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIl;->b:Lcom/appboy/Appboy;

    iput-object p2, p0, LIl;->c:Ljava/lang/String;

    iput-object p3, p0, LIl;->d:Ljava/lang/String;

    iput-object p4, p0, LIl;->e:Ljava/math/BigDecimal;

    iput p5, p0, LIl;->f:I

    iput-object p6, p0, LIl;->g:Ls20;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, LIl;->b:Lcom/appboy/Appboy;

    iget-object v1, p0, LIl;->c:Ljava/lang/String;

    iget-object v2, p0, LIl;->d:Ljava/lang/String;

    iget-object v3, p0, LIl;->e:Ljava/math/BigDecimal;

    iget v4, p0, LIl;->f:I

    iget-object v5, p0, LIl;->g:Ls20;

    invoke-static/range {v0 .. v5}, Lcom/appboy/Appboy;->n(Lcom/appboy/Appboy;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILs20;)V

    return-void
.end method
