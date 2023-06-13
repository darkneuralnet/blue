.class public final synthetic LTG6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/work/impl/WorkDatabase;

.field public final synthetic c:LHG6;

.field public final synthetic d:LHG6;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/util/Set;

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase;LHG6;LHG6;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTG6;->b:Landroidx/work/impl/WorkDatabase;

    iput-object p2, p0, LTG6;->c:LHG6;

    iput-object p3, p0, LTG6;->d:LHG6;

    iput-object p4, p0, LTG6;->e:Ljava/util/List;

    iput-object p5, p0, LTG6;->f:Ljava/lang/String;

    iput-object p6, p0, LTG6;->g:Ljava/util/Set;

    iput-boolean p7, p0, LTG6;->h:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, LTG6;->b:Landroidx/work/impl/WorkDatabase;

    iget-object v1, p0, LTG6;->c:LHG6;

    iget-object v2, p0, LTG6;->d:LHG6;

    iget-object v3, p0, LTG6;->e:Ljava/util/List;

    iget-object v4, p0, LTG6;->f:Ljava/lang/String;

    iget-object v5, p0, LTG6;->g:Ljava/util/Set;

    iget-boolean v6, p0, LTG6;->h:Z

    invoke-static/range {v0 .. v6}, LUG6;->b(Landroidx/work/impl/WorkDatabase;LHG6;LHG6;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    return-void
.end method
