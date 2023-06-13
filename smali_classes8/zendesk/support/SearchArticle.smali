.class public Lzendesk/support/SearchArticle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final article:Lzendesk/support/Article;

.field private final category:Lzendesk/support/Category;

.field private final section:Lzendesk/support/Section;


# direct methods
.method public constructor <init>(Lzendesk/support/Article;Lzendesk/support/Section;Lzendesk/support/Category;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/SearchArticle;->article:Lzendesk/support/Article;

    iput-object p2, p0, Lzendesk/support/SearchArticle;->section:Lzendesk/support/Section;

    iput-object p3, p0, Lzendesk/support/SearchArticle;->category:Lzendesk/support/Category;

    return-void
.end method


# virtual methods
.method public getArticle()Lzendesk/support/Article;
    .locals 1

    iget-object v0, p0, Lzendesk/support/SearchArticle;->article:Lzendesk/support/Article;

    return-object v0
.end method

.method public getCategory()Lzendesk/support/Category;
    .locals 1

    iget-object v0, p0, Lzendesk/support/SearchArticle;->category:Lzendesk/support/Category;

    return-object v0
.end method

.method public getSection()Lzendesk/support/Section;
    .locals 1

    iget-object v0, p0, Lzendesk/support/SearchArticle;->section:Lzendesk/support/Section;

    return-object v0
.end method
